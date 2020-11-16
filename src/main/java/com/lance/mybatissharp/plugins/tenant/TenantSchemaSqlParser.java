package com.lance.mybatissharp.plugins.tenant;

import com.baomidou.mybatisplus.core.parser.AbstractJsqlParser;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import net.sf.jsqlparser.schema.Table;
import net.sf.jsqlparser.statement.delete.Delete;
import net.sf.jsqlparser.statement.insert.Insert;
import net.sf.jsqlparser.statement.select.PlainSelect;
import net.sf.jsqlparser.statement.select.SelectBody;
import net.sf.jsqlparser.statement.select.SetOperationList;
import net.sf.jsqlparser.statement.select.WithItem;
import net.sf.jsqlparser.statement.update.Update;

/**
 * 租户 SQL 解析（ Schema 表级 ）
 *
 * @author Lance
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
public class TenantSchemaSqlParser extends AbstractJsqlParser {

    private TenantSchemaHandler tenantSchemaHandler;

    @Override
    public void processInsert(Insert insert) {
        process0(insert.getTable());
    }

    @Override
    public void processDelete(Delete delete) {
        process0(delete.getTable());
    }

    @Override
    public void processUpdate(Update update) {
        process0(update.getTable());
    }

    @Override
    public void processSelectBody(SelectBody selectBody) {
        if (selectBody instanceof PlainSelect) {
            process0((Table) ((PlainSelect) selectBody).getFromItem());
        } else if (selectBody instanceof WithItem) {
            WithItem withItem = (WithItem) selectBody;
            if (withItem.getSelectBody() != null) {
                processSelectBody(withItem.getSelectBody());
            }
        } else {
            SetOperationList operationList = (SetOperationList) selectBody;
            if (operationList.getSelects() != null && operationList.getSelects().size() > 0) {
                operationList.getSelects().forEach(this::processSelectBody);
            }
        }
    }

    private void process0(Table table) {
        if (tenantSchemaHandler == null || tenantSchemaHandler.doTableFilter(table.getName())) {
            return;
        }

        String newSchema = tenantSchemaHandler.getTenantSchema();
        if (newSchema == null || newSchema.isEmpty()) {
            return;
        }
        table.setSchemaName(newSchema);
    }
}

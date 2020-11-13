package com.lance.mybatissharp.plugins.tenant;

import com.baomidou.mybatisplus.core.parser.AbstractJsqlParser;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import net.sf.jsqlparser.statement.delete.Delete;
import net.sf.jsqlparser.statement.insert.Insert;
import net.sf.jsqlparser.statement.select.SelectBody;
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

    }

    @Override
    public void processDelete(Delete delete) {

    }

    @Override
    public void processUpdate(Update update) {

    }

    @Override
    public void processSelectBody(SelectBody selectBody) {

    }
}

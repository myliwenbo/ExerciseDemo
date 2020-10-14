package vip.xjdai.generator.templates.impl;

import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.generator.config.FileOutConfig;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import vip.xjdai.generator.templates.Templates;
;

public class QueryReuqestEntityTemplates implements Templates {


    @Override
    public FileOutConfig contextMethod() {
        return new FileOutConfig(QUERY_ENTITY_TEMPLATES) {
            @Override
            public String outputFile(TableInfo tableInfo) {
                return QUERY_ENTITY + tableInfo.getEntityName() + Templates.QUERY_REQUEST_SUFFIX + StringPool.DOT_JAVA;
            }
        };
    }
}

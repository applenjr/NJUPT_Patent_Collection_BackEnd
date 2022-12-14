package cn.njupt.njupt_patent_collection_backend.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author baoyuhao
 * @date 2022/11/23 16:33:40
 * @description
 * @version [1.0]
 */
@Component
public class DateConfig implements MetaObjectHandler
{
    
    /**
     * 使用BaseMapper做添加操作时候，这个方法执行
     * @param metaObject
     */
    @Override
    public void insertFill(MetaObject metaObject)
    {
        // 设置属性值
        this.setFieldValByName("createUser", "njupt", metaObject);
        this.setFieldValByName("createTime", new Date(), metaObject);
        this.setFieldValByName("updateUser", "njupt", metaObject);
        this.setFieldValByName("updateTime", new Date(), metaObject);
    }
    
    /**
     * 使用mp做修改操作时候，这个方法执行
     * @param metaObject
     */
    @Override
    public void updateFill(MetaObject metaObject)
    {
        this.setFieldValByName("updateUser", "baoyuhao", metaObject);
        this.setFieldValByName("updateTime", new Date(), metaObject);
    }
}


package cn.njupt.njupt_patent_collection_backend.mapper;

import cn.njupt.njupt_patent_collection_backend.entity.UserAccount;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 * @author baoyuhao
 * @version [版本号]
 * @time 2022/12/16 16:47:46
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */

@Repository
public interface LoginMapper extends BaseMapper<UserAccount> {

}

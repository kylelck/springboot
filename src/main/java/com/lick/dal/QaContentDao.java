package com.lick.dal;

import com.lick.entity.QaContent;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @Author: lick@hsyuntai.com
 * @Date: 2017年10月23日 17:02
 * @Copyright: 版权归hsyuntai 所有
 */
@Repository
public interface QaContentDao {
    /**
     * @Description:
     * @Method:getQaContentAll
     * @params:[]
     * @returnType:com.lick.entity.QaContent
     * @Author:lick@hsyuntai.com
     * @Date: 2017/10/23 17:05
     * @Copyright: 版权归hsyuntai 所有
     * @return
     */
    public QaContent getQaContentAll();
}

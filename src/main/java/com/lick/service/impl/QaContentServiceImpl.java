package com.lick.service.impl;

import com.lick.dal.QaContentDao;
import com.lick.entity.QaContent;
import com.lick.service.QaContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: lick@hsyuntai.com
 * @Date: 2017年10月23日 17:08
 * @Copyright: 版权归hsyuntai 所有
 */
@Service
public class QaContentServiceImpl implements QaContentService {
    @Autowired
    private QaContentDao qaContentDao;
    @Override
    public QaContent getQaContent(){
        return qaContentDao.getQaContentAll();
    }
}

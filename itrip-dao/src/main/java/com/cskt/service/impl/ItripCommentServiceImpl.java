package com.cskt.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cskt.mapper.ItripCommentMapper;
import com.cskt.entity.ItripComment;
import com.cskt.service.ItripCommentService;
/**
  * @author: 朱晴晴
  * @date: 2021/1/5 10:20
  * @description ItripCommentServiceImpl
  */
@Service
public class ItripCommentServiceImpl extends ServiceImpl<ItripCommentMapper, ItripComment> implements ItripCommentService{

}

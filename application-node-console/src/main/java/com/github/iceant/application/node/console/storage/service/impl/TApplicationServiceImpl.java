package com.github.iceant.application.node.console.storage.service.impl;

import com.github.iceant.application.node.console.storage.entity.TApplication;
import com.github.iceant.application.node.console.storage.mapper.TApplicationMapper;
import com.github.iceant.application.node.console.storage.service.ITApplicationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 陈鹏
 * @since 2022-03-26
 */
@Service
public class TApplicationServiceImpl extends ServiceImpl<TApplicationMapper, TApplication> implements ITApplicationService {

}

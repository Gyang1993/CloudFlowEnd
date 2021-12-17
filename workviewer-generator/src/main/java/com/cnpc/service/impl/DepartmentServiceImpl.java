package com.cnpc.service.impl;

import com.cnpc.pojo.Department;
import com.cnpc.mapper.DepartmentMapper;
import com.cnpc.service.IDepartmentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yangg19
 * @since 2021-11-29
 */
@Service
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements IDepartmentService {

}

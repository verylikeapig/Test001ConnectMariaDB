package com.shop.service;

import com.shop.entity.My01svnfilelist;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (My01svnfilelist)表服务接口
 *
 * @author makejava
 * @since 2022-03-07 00:51:37
 */
public interface My01svnfilelistService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    My01svnfilelist queryById(Long id);

    /**
     * 分页查询
     *
     * @param my01svnfilelist 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<My01svnfilelist> queryByPage(My01svnfilelist my01svnfilelist, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param my01svnfilelist 实例对象
     * @return 实例对象
     */
    My01svnfilelist insert(My01svnfilelist my01svnfilelist);

    /**
     * 修改数据
     *
     * @param my01svnfilelist 实例对象
     * @return 实例对象
     */
    My01svnfilelist update(My01svnfilelist my01svnfilelist);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}

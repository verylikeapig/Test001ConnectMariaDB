package com.shop.service.impl;

import com.shop.entity.My01svnfilelist;
import com.shop.dao.My01svnfilelistDao;
import com.shop.service.My01svnfilelistService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (My01svnfilelist)表服务实现类
 *
 * @author makejava
 * @since 2022-03-07 00:51:40
 */
@Service("my01svnfilelistService")
public class My01svnfilelistServiceImpl implements My01svnfilelistService {
    @Resource
    private My01svnfilelistDao my01svnfilelistDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public My01svnfilelist queryById(Long id) {
        return this.my01svnfilelistDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param my01svnfilelist 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<My01svnfilelist> queryByPage(My01svnfilelist my01svnfilelist, PageRequest pageRequest) {
        long total = this.my01svnfilelistDao.count(my01svnfilelist);
        return new PageImpl<>(this.my01svnfilelistDao.queryAllByLimit(my01svnfilelist, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param my01svnfilelist 实例对象
     * @return 实例对象
     */
    @Override
    public My01svnfilelist insert(My01svnfilelist my01svnfilelist) {
        this.my01svnfilelistDao.insert(my01svnfilelist);
        return my01svnfilelist;
    }

    /**
     * 修改数据
     *
     * @param my01svnfilelist 实例对象
     * @return 实例对象
     */
    @Override
    public My01svnfilelist update(My01svnfilelist my01svnfilelist) {
        this.my01svnfilelistDao.update(my01svnfilelist);
        return this.queryById(my01svnfilelist.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.my01svnfilelistDao.deleteById(id) > 0;
    }
}

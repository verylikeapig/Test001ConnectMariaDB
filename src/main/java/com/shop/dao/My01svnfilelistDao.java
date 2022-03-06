package com.shop.dao;

import com.shop.entity.My01svnfilelist;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (My01svnfilelist)表数据库访问层
 *
 * @author makejava
 * @since 2022-03-07 00:51:16
 */
public interface My01svnfilelistDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    My01svnfilelist queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param my01svnfilelist 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<My01svnfilelist> queryAllByLimit(My01svnfilelist my01svnfilelist, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param my01svnfilelist 查询条件
     * @return 总行数
     */
    long count(My01svnfilelist my01svnfilelist);

    /**
     * 新增数据
     *
     * @param my01svnfilelist 实例对象
     * @return 影响行数
     */
    int insert(My01svnfilelist my01svnfilelist);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<My01svnfilelist> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<My01svnfilelist> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<My01svnfilelist> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<My01svnfilelist> entities);

    /**
     * 修改数据
     *
     * @param my01svnfilelist 实例对象
     * @return 影响行数
     */
    int update(My01svnfilelist my01svnfilelist);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}


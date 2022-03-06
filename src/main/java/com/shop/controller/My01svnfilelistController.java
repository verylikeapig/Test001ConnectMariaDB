package com.shop.controller;

import com.shop.entity.My01svnfilelist;
import com.shop.service.My01svnfilelistService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (My01svnfilelist)表控制层
 *
 * @author makejava
 * @since 2022-03-07 00:51:10
 */
@RestController
@RequestMapping("my01svnfilelist")
public class My01svnfilelistController {
    /**
     * 服务对象
     */
    @Resource
    private My01svnfilelistService my01svnfilelistService;

    /**
     * 分页查询
     *
     * @param my01svnfilelist 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<My01svnfilelist>> queryByPage(My01svnfilelist my01svnfilelist, PageRequest pageRequest) {
        return ResponseEntity.ok(this.my01svnfilelistService.queryByPage(my01svnfilelist, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<My01svnfilelist> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.my01svnfilelistService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param my01svnfilelist 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<My01svnfilelist> add(My01svnfilelist my01svnfilelist) {
        return ResponseEntity.ok(this.my01svnfilelistService.insert(my01svnfilelist));
    }

    /**
     * 编辑数据
     *
     * @param my01svnfilelist 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<My01svnfilelist> edit(My01svnfilelist my01svnfilelist) {
        return ResponseEntity.ok(this.my01svnfilelistService.update(my01svnfilelist));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.my01svnfilelistService.deleteById(id));
    }

}


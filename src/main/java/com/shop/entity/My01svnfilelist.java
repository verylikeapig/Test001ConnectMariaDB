package com.shop.entity;

import java.io.Serializable;

/**
 * (My01svnfilelist)实体类
 *
 * @author makejava
 * @since 2022-03-07 00:51:27
 */
public class My01svnfilelist implements Serializable {
    private static final long serialVersionUID = -26561703164330202L;
    
    private Long id;
    
    private String commitversion;
    
    private String svnpath;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCommitversion() {
        return commitversion;
    }

    public void setCommitversion(String commitversion) {
        this.commitversion = commitversion;
    }

    public String getSvnpath() {
        return svnpath;
    }

    public void setSvnpath(String svnpath) {
        this.svnpath = svnpath;
    }

}


package com.cqm.greendao.db;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by chenqm on 2016/12/21.
 */
@Entity
public class Banner {
    @Id(autoincrement = true)
    private Long id;
    private String url;
    private int type;
    @Generated(hash = 333342228)
    public Banner(Long id, String url, int type) {
        this.id = id;
        this.url = url;
        this.type = type;
    }
    @Generated(hash = 2026719322)
    public Banner() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getUrl() {
        return this.url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public int getType() {
        return this.type;
    }
    public void setType(int type) {
        this.type = type;
    }
}

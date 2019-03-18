package com.lwl.prototype.demo;

import java.io.*;
import java.util.Date;

public class BaseEntity implements Serializable {
    private Long id;
    private Date createTime;
    private Date updateTime;
    private Long createUserId;
    private Long updateUserId;
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    public Long getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(Long updateUserId) {
        this.updateUserId = updateUserId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 使用序列化反序列化深克隆对象
     * @return
     */
    public BaseEntity copyEntity(){
        {
            BaseEntity copyObj = null;
            ObjectOutputStream oos = null;
            ObjectInputStream ois = null;
            try {
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                oos = new ObjectOutputStream(baos);
                oos.writeObject(this);
                oos.flush();

                ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
                ois = new ObjectInputStream(bais);
                copyObj =(BaseEntity)ois.readObject();
                copyObj.setId(null);
                Date currentTime = new Date();
                copyObj.setCreateTime(currentTime);
                copyObj.setUpdateTime(currentTime);
            } catch (Exception e) {
                e.printStackTrace();
            }finally {
                if(oos!=null){
                    try {
                        oos.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if(ois!=null){
                    try {
                        ois.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            return copyObj;
        }
    }

    @Override
    public String toString() {
        return "BaseEntity{" +
                "id=" + id +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", createUserId=" + createUserId +
                ", updateUserId=" + updateUserId +
                ", description='" + description + '\'' +
                '}';
    }
}

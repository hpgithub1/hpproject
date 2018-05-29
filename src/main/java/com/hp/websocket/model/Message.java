package com.hp.websocket.model;

import java.io.Serializable;
import java.util.Date;

public class Message implements Serializable {
    /**
     * ��Ϣid
     */
    private String id;

    /**
     * ���ͷ�
     */
    private Integer messagefromuser;

    /**
     * ���շ�
     */
    private Integer messagetouser;

    /**
     * ����ʱ��
     */
    private Date datetime;

    /**
     * ����
     */
    private String content;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getMessagefromuser() {
        return messagefromuser;
    }

    public void setMessagefromuser(Integer messagefromuser) {
        this.messagefromuser = messagefromuser;
    }

    public Integer getMessagetouser() {
        return messagetouser;
    }

    public void setMessagetouser(Integer messagetouser) {
        this.messagetouser = messagetouser;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", messagefromuser=").append(messagefromuser);
        sb.append(", messagetouser=").append(messagetouser);
        sb.append(", datetime=").append(datetime);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
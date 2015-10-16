package io.pivotal.testdriventodo;

/**
 * Created by pivotal on 10/16/15.
 */
public class Item {
    private String content;
    private boolean isEditable;

    public Item(String content, boolean isEditable){
        this.content = content;
        this.isEditable = isEditable;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isEditable() {
        return isEditable;
    }

    public void setIsEditable(boolean isEditable) {
        this.isEditable = isEditable;
    }
}

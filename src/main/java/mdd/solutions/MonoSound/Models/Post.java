
package mdd.solutions.MonoSound.Models;

public class Post {
    private long ID;
    private String description;
    private String content;

    public Post(long ID, String description, String content) {
        this.ID = ID;
        this.description = description;
        this.content = content;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

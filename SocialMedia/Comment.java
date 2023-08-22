package SocialMedia;

import java.time.LocalDate;

public class Comment {
private String comment;
private LocalDate commentDate;
private int exampleId;

    public Comment(String comment, LocalDate commentDate) {
        this.comment = comment;
        this.commentDate = commentDate;

    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public LocalDate getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(LocalDate commentDate) {
        this.commentDate = commentDate;
    }

    public int getExampleId() {
        return exampleId;
    }

    public void setExampleId(int exampleId) {
        this.exampleId = exampleId;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "comment='" + comment + '\'' +
                ", commentDate=" + commentDate +
                ", exampleId=" + exampleId +
                '}';
    }
}

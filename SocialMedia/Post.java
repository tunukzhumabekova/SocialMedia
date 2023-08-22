package SocialMedia;

import java.time.LocalDate;
import java.util.Arrays;

public class Post {
private String image;
private String description;
private LocalDate created;

    private  int exampleId;
    private Comment[]comments;

    public Post(String image, String description, LocalDate created, Comment[] comments) {
        this.image = image;
        this.description = description;
        this.created = created;
        this.exampleId = exampleId;
        this.comments = comments;
        for (int i = 0;  i< comments.length;i ++) {
            comments[i].setExampleId(i+1);

        }
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getCreated() {
        return created;
    }

    public void setCreated(LocalDate created) {
        this.created = created;
    }

    public int getExampleId() {
        return exampleId;
    }

    public void setExampleId(int exampleId) {
        this.exampleId = exampleId;
    }

    public Comment[] getComments(long commentId) {
        return comments;
    }

    public void setComments(Comment[] comments) {
        this.comments = comments;
    }

//    public Post(String image, String description, LocalDate created, Comment[] comments) {
//        this.image = image;
//        this.description = description;
//        this.created = created;
//        this.comments = comments;
//        for(int i=0; i<comments.length; i++){
//            comments[i].getExampleId(i+1);
//        }
//    }













    public void updateComment(Long commentId, String newText) {
        for (Comment comment : comments) {
            if (comment.getExampleId()==(commentId)) {

                comment.setComment(newText);
                System.out.println(comment);


            }
        }
    }
    public void deleteComment(Comment commentToDelete) {
        Comment[] updatedComments = new Comment[comments.length - 1];
        int index = 0;

        for (Comment comment : comments) {
            if (!comment.equals(commentToDelete)) {
                updatedComments[index] = comment;
                index++;
            }
        }

        comments = updatedComments;
        System.out.println("Comment deleted: " + commentToDelete);

}
    @Override
    public String toString() {
        return "Post{" +
                "image='" + image + '\'' +
                ", description='" + description + '\'' +
                ", created=" + created +
                ", id1=" + exampleId +
                ", comments=" + Arrays.toString(comments) +
                '}';
    }
}


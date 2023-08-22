package SocialMedia;

import java.time.LocalDate;
import java.util.Arrays;

public class Profile {
    private String fullName;
    private LocalDate dateOfBirth;
    private String gender;
    private String bio;
    private Post[] posts;

    private int exampleId;



    public Profile(String fullName, LocalDate dateOfBirth, String gender, String bio, Post[] posts) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.bio = bio;
        this.posts = posts;
        for(int i=0; i<posts.length; i++){
            posts[i].setExampleId(i+1);
        }
    }




    public Profile(Profile profile1) {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Post[] getPosts() {
        return posts;
    }

    public void setPosts(Post[] posts) {
        this.posts = posts;
    }

    public int getExampleId(int exampleId) {
        return this.exampleId;
    }

    public void setExampleId(int exampleId) {
        this.exampleId = exampleId;
    }

    public Profile(Profile profile1, Profile profile2, Profile profile3) {
    }


    public void findCommentByPostId(long commentId) {
        for (Post post1 : posts) {
            for (Comment comment : post1.getComments(commentId)) {
                if (comment.getExampleId() == commentId) {
                    System.out.println("Found comment: " + comment.getComment());
                    return;
                }
            }
        }
        System.out.println("Comment not found.");
    }

    @Override
    public String toString() {
        return "Profile{" +
                "fullName='" + fullName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender='" + gender + '\'' +
                ", bio='" + bio + '\'' +
                ", posts=" + Arrays.toString(posts) +
                ", exampleId=" + exampleId +
                '}';
    }
}







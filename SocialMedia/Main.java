package SocialMedia;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Comment comment1 = new Comment("This is a great post!", LocalDate.of(2023, 7, 5));
        Comment comment2 = new Comment("I agree with you.", LocalDate.of(2023, 7, 10));
        Comment comment3 = new Comment("Nice work!", LocalDate.of(2023, 8, 1));
        Comment comment4 = new Comment("Interesting discussion.", LocalDate.of(2023, 8, 15));
        Comment comment5 = new Comment("Keep it up!", LocalDate.of(2023, 9, 2));
        Comment comment6 = new Comment("I have a different perspective.", LocalDate.of(2023, 9, 10));
        Comment comment7 = new Comment("Not sure I agree...", LocalDate.of(2023, 10, 8));
        Comment comment8 = new Comment("Awesome content!", LocalDate.of(2023, 10, 20));
        Comment comment9 = new Comment("Looking forward to more.", LocalDate.of(2023, 11, 5));
        Comment comment10 = new Comment("You've got my support!", LocalDate.of(2023, 11, 15));
        Comment comment11 = new Comment("I learned something new.", LocalDate.of(2023, 12, 1));
        Comment comment12 = new Comment("Can you explain further?", LocalDate.of(2023, 12, 12));
        Comment[] comments1 = {comment1, comment2};
        Comment[] comments2 = {comment3, comment4};
        Comment[] comments3 = {comment5, comment6};
        Comment[] comments4 = {comment7, comment8};
        Comment[] comments5 = {comment9, comment10};
        Comment[] comments6 = {comment11, comment12};
        Post post1 = new Post("postImage1", "Description 1", LocalDate.of(2023, 1, 9), comments1);
        Post post2 = new Post("postImage2", "Description 2", LocalDate.of(2023, 2, 15), comments2);
        Post post3 = new Post("postImage3", "Description 3", LocalDate.of(2023, 3, 20), comments3);
        Post post4 = new Post("postImage4", "Description 4", LocalDate.of(2023, 4, 8), comments4);
        Post post5 = new Post("postImage5", "Description 5", LocalDate.of(2023, 5, 3), comments5);
        Post post6 = new Post("postImage6", "Description 6", LocalDate.of(2023, 6, 27), comments6);
        Post[] posts1 = {post1, post2};
        Post[] posts2 = {post3, post4};
        Post[] posts3 = {post5, post6};
        Post[][] allPosts = {posts1, posts2, posts3};
        Profile profile1 = new Profile("JohnDoe", LocalDate.of(1995, 3, 15), "Male", "Bio 2", posts1);
        Profile profile2 = new Profile("JaneSmith", LocalDate.of(2000, 9, 20), "Female", "Bio 3", posts2);
        Profile profile3 = new Profile("User123", LocalDate.of(1988, 11, 10), "Non-binary", "Bio 4", posts3);

        Profile[] profiles1 = {profile1};
        Profile[] profiles2 = {profile2};
        Profile[] profiles3 = {profile3};


        User user1 = new User("john_doe", "john@example.com", 123456, profiles1);
        User user2 = new User("jane_smith", "jane@example.com", 987654, profiles2);
        User user3 = new User("user123", "user@example.com", 567890, profiles3);
        User[] users = { user2, user3};
        DataBase dataBase = new DataBase(users);

        while (true) {
            System.out.println("Select an action:");
            System.out.println("1. Find User by ID");
            System.out.println("2. Save User");
            System.out.println("3. Update User Profile");
            System.out.println("4. Delete User");
            System.out.println("5. Search Post");
            System.out.println("6. Save Profile");
            System.out.println("7. Find Profile by User ID");
            System.out.println("8. Get Posts by User ID");
            System.out.println("9. Delete Profile by User ID");
            System.out.println("10. Save Post");
            System.out.println("11. Find Comment by Post ID");
            System.out.println("12. Update Comment");
            System.out.println("13. Search Post");
            System.out.println("14. Delete Post by ID");
            System.out.println("15  Delete Comment");
            System.out.println("16. Exit");
            System.out.print("Enter your choice: ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter User ID: ");
                    long userId1 = scanner.nextLong();
                    dataBase.findUserById(userId1);
                    break;

                case 2:
                    System.out.println("Enter a user:");
                    dataBase.saveUser(user1);
                    System.out.println("User saved!");
                    break;

                case 3:
                    System.out.print("Enter User ID: ");
                    long userId2 = scanner.nextLong();
                    dataBase.updateUserProfile(userId2, profile1);
                    System.out.println("User profile updated!");
                    break;

                case 4:
                    System.out.print("Enter User ID: ");
                    long userId3 = scanner.nextLong();
                    dataBase.deleteUser(userId3);

                    break;

                case 5:
                    user1.searchPost("Description 8");
                    break;

                case 6:
                    dataBase.saveProfile(1L, profile1);
                    System.out.println("Profile saved!");
                    break;

                case 7:
                    System.out.print("Enter User ID: ");
                    long userId4 = scanner.nextLong();
                    dataBase.findProfileByUserId(userId4);
                    break;

                case 8:
                    System.out.print("Enter User ID: ");
                    long userId5 = scanner.nextLong();
                    dataBase.getPostsByUserId(userId5);
                    break;

                case 9:
                    System.out.print("Enter User ID: ");
                    long userId6 = scanner.nextLong();
                    dataBase.deleteProfileByUserId(userId6);
                    break;

                case 10:
                    dataBase.savePost(1, post1);
                    System.out.println("Post saved!");
                    break;

                case 11:
                    profile1.findCommentByPostId(3L);
                    break;

                case 12:
                    post1.updateComment(1L, "dfghjkl");
                    System.out.println("Comment updated!");
                    break;

                case 13:
                    user1.searchPost("Description 8");
                    break;

                case 14:
                    System.out.print("Enter Post ID: ");
                    long postId = scanner.nextLong();
                    user1.deletePostById(postId);
                    System.out.println("Post deleted!");
                    break;

                case 15:
                    post1.deleteComment(comment1);
                    System.out.println("Comment deleted!");
                    break;

                case 16:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }
        }
    }
}

//     dataBase.findUserById(1);
//
//     dataBase.saveUser(user1);
//            dataBase.updateUserProfile(2,profile1);
//           System.out.println(dataBase.deleteUser(1L));
//          dataBase.saveProfile(1L,profile1);
//         dataBase.findProfileByUserId(1L);
//        dataBase.getPostsByUserId(1L);
//      System.out.println(dataBase.deleteProfileByUserId(1L));
// dataBase.savePost(1,post1);
//            profile1.findCommentByPostId(3L);
//      post1.updateComment(1L,"dfghjkl");
//        user1.searchPost("Description 8");
// user1.deletePostById(2L);
//        System.out.println(profile1);
//       dataBase.saveComments(1,comment1);
//post1.deleteComment(comment1);
//        System.out.println(post1);


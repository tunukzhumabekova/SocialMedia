package SocialMedia;

import java.util.Arrays;

public class DataBase {
    private User[] users;
    private Profile[] profiles;
    private Post post;

    public DataBase(Profile[] profiles) {
        this.profiles = profiles;
    }

    public DataBase(User[] users, Profile[] profiles, Post post) {
        this.users = users;
        this.profiles = profiles;
        this.post = post;
    }

    public DataBase(User[] users, Profile profiles) {
        this.users = users;
    }

    public DataBase(User[] users) {
        this.users=users;
    }

    public User[] getUsers() {
        return users;
    }
    public void setUsers(User[] users) {
        this.users = users;
    }
    public Profile[] getProfiles() {
        return profiles;
    }
    public void setProfiles(Profile[] profiles) {
        this.profiles = profiles;
    }
    public void saveUser(User user1) {
        boolean userExists = false;

        for (User user2 : users) {
            if (user2.getUserName().equals(user1.getUserName())) {
                userExists = true;
                System.out.println("User already exists in the database.");
                break;
            }
        }

        if (!userExists) {
            for (int i = 0; i < users.length; i++) {
                if (!users[i].equals(user1.getUserName())) {
                    users[i] = user1;
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(users));
    }
    public void findUserById(long id) {
        for (User user1:users){
            if (user1.getExampleId()==id){
                System.out.println(user1);
            }

        }

    }

    void updateUserProfile(long userId,Profile newProfile) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].getExampleId()== userId) {
                users[i].setProfiles(newProfile);
                System.out.println(users[i]);
            }

        }

    }
    public int deleteUser(Long userId) {
        int index = 0;
        User[] updatedUsers = new User[users.length - 1];

        for (int i = 0; i < users.length; i++) {
            if (users[i].getExampleId()!= userId) {
                updatedUsers[index] = users[i];
                index++;
            }
        }
        users = updatedUsers;
        System.out.println("Пользователь с айди " + userId + " удален.");
        System.out.println("Новый массив после удаления: " + Arrays.toString(users));

        return index;
    }
    public void saveProfile(Long userId, Profile profile) {
        boolean idProv = true;
        for (User user1 : users) {
            if (user1.getExampleId() == userId) {
                idProv = false;
                System.out.println("Данный пользователь с таким (АЙДИ) есть в базе");
                if (user1.getProfiles().equals(profile)) {
                    System.out.println("Данный профиль уже стоит на вашем аккаунте");
                } else {
                    System.out.println("Профиль успешно обновлен");
                    user1.setProfiles(profile);
                    System.out.println(profile);
                }
            }
        }
        if (!idProv){
            System.out.println("Нету в базе данных");
        }
    }
    public void findProfileByUserId(long userId){
        for (int i = 0; i < users.length; i++) {
            if (users[i].getExampleId()==userId){
                System.out.println(Arrays.toString(users[i].getProfiles()));
            }
        }

    }
    public String deleteProfileByUserId(long userId) {
        for (User user : users) {
            if (user.getExampleId() == userId) {
                user.setProfiles(null);
                return "Profiles deleted for user with ID " + userId;
            }
        }
        return "User with ID " + userId + " not found.";
    }
    public void savePost(long userId, Post post) {
        boolean userExists = false;

        for (User user : users) {
            if (user.getExampleId() == userId) {
                userExists = true;
                System.out.println("User found.");

                for (Profile profile : user.getProfiles()) {
                    for (Post existingPost : profile.getPosts()) {
                        if (existingPost.equals(post)) {
                            System.out.println("Post already exists in the profiles.");
                            return;
                        }
                    }
                }
                for (Profile profile : user.getProfiles()) {
                    profile.getPosts();
                }

                System.out.println("Post added successfully.");
                return;
            }
        }

        if (!userExists) {
            System.out.println("User not found.");
        }
    }
    public void getPostsByUserId(long userId) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].getExampleId()== userId)
                System.out.println(Arrays.toString(users[i].getProfiles()[i].getPosts()));
        }
    }


        public void saveComments(long postId, Comment comment) {
            boolean postExists = false;

            for (User user : users) {
                for (Profile profile : user.getProfiles()) {
                    for (Post post : profile.getPosts()) {
                        if (post.getExampleId() == postId) {
                            postExists = true;
                            post.getComments(comment.getExampleId());
                            System.out.println("Comment added to the post.");
                            return;
                        }
                    }
                }
            }

            if (!postExists) {
                System.out.println("Post not found.");
            }
        }
    }





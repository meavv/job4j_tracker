package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User rsl = null;
        for (User user : users) {
            if (user.getUsername().equals(login)) {
                rsl = user;
                break;
            }
        }
        if (rsl == null) {
            throw new UserNotFoundException("Нет такого пользователя");
        }

        return rsl;
    }

    public static boolean validate(User user) throws UserInvalidException {
        int validName = user.getUsername().length();
        if (user.isValid() && (validName >= 3)) {
            return true;
        } else {
            throw new UserInvalidException("Не валидный пользватель");
        }

    }

    public static void main(String[] args)  {
        User[] users = {
                new User("Petr Arsentev", true),
                new User("Qwe", true)
        };
      try {
          User user = findUser(users, "Petr Arsentev");
          if (validate(user)) {
              System.out.println(user.getUsername() + System.lineSeparator() + user.isValid());
          }
      } catch (UserInvalidException r) {
          r.printStackTrace();
      } catch (UserNotFoundException e) {
          e.printStackTrace();
      }
    }
}
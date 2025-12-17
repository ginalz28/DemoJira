public class LoginService {
    public boolean checkLogin(String username, String password) {
        // GIẢ LẬP LỖI (BUG):
        // Yêu cầu đề bài là pass "123456", nhưng Dev code nhầm thành "123"
        if ("ad".equals(username) && "123456".equals(password)) {
            return true;
        }
        return false;
    }
}
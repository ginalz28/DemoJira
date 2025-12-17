public class LoginService {
    public boolean checkLogin(String username, String password) {
        // GIẢ LẬP LỖI (BUG):
        // Yêu cầu đề bài là pass "123456", nhưng  code nhầm thành "123"
        //UPDATE
        if ("admin".equals(username) && "123".equals(password)) {
            return true;
        }
        return false;
    }
}
import org.junit.Test;
import static org.junit.Assert.*;

public class LoginServiceTest {
    LoginService service = new LoginService();

    @Test
    public void testLoginCorrect() {
        // Test case: Nhập đúng admin và 123456
        boolean result = service.checkLogin("admin", "123456");
        
        // Mong đợi result phải là True. Nếu False -> Test Fail.
        assertTrue("Lỗi: Nhập đúng mật khẩu nhưng login thất bại", result);
    }
}
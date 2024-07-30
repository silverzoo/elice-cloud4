package practice3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInjectionService {

    private UserRepository userRepository;
    private AnotherUserRepository anotherUserRepository;

    // TODO: 필드 주입
    @Autowired
    private YetAnotherUserRepository yetAnotherUserRepository;

    // TODO: 생성자 주입
    @Autowired
    public UserInjectionService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // TODO: 세터 주입
    @Autowired
    public void setAnotherUserRepository(AnotherUserRepository anotherUserRepository) {
        this.anotherUserRepository = anotherUserRepository;
    }

}
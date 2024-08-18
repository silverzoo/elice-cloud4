package chapter08.beanvalidation;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SubjectPostDto {

    // 지시사항 참고

    @NotBlank
    @Pattern(regexp = "^[a-zA-Z0-9가-힣 ]+$", message = "과목명은 문자, 숫자, 한글, 공백만을 포함할 수 있습니다.")
    private String name;

    @NotNull(message = "가격은 공백이어서는 안됩니다.")
    @Max(value = 100000, message = "가격은 최대 100,000원까지만 가능합니다.")
    private Integer price;

    public Subject toEntity() {
        return new Subject(name, price);
    }
}
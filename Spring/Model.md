model.addAttribute()는 Spring MVC에서 컨트롤러에서 뷰로 데이터를 전달하는 데 사용되는 메서드입니다. 이 메서드를 사용하면 컨트롤러에서 처리한 결과나 계산된 데이터를 뷰에 전달하여 뷰에서 해당 데이터를 사용할 수 있게 됩니다.

model.addAttribute() 메서드는 두 개의 인자를 받습니다:

속성 이름 (attribute name): 이는 데이터를 식별하는 데 사용되는 문자열입니다. 뷰에서 이 이름을 통해 데이터를 참조할 수 있습니다.
속성 값 (attribute value): 이는 뷰에 전달하려는 데이터 자체입니다.
예를 들어, 다음과 같이 컨트롤러에서 model.addAttribute()를 사용하여 데이터를 뷰로 전달할 수 있습니다:

```java
import org.springframework.ui.Model;

@Controller
public class SampleController {

    @RequestMapping("/greeting")
    public String greeting(Model model) {
        String message = "Hello, world!";
        model.addAttribute("greetingMessage", message);
        return "greetingPage";
    }
}
```

위의 예제에서 greeting() 메서드는 Model 객체를 매개변수로 받고 있습니다. model.addAttribute("greetingMessage", message) 코드는 "greetingMessage"라는 이름으로 문자열 "Hello, world!"를 뷰에 전달하고 있습니다. 이렇게 컨트롤러에서 전달한 데이터는 "greetingPage" 라는 뷰 페이지에서 사용할 수 있게 됩니다.

뷰 페이지에서는 전달받은 데이터를 다음과 같이 사용할 수 있습니다:

```html
<!DOCTYPE html>
<html>
<head>
    <title>Greeting Page</title>
</head>
<body>
    <h1>${greetingMessage}</h1>
</body>
</html>
```

${greetingMessage}는 컨트롤러에서 전달한 데이터인 "Hello, world!"를 출력하는 부분입니다. 이렇게 컨트롤러에서 model.addAttribute()로 데이터를 설정하고, 뷰에서 ${} 형식으로 해당 데이터를 사용할 수 있습니다.
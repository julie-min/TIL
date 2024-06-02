# Spring Web Security
- 스프링 웹 시큐리티의 기본 동작 방식
- 서블릿의 여러 종류의 필터 + 인터셉터로 처리됨 (Interceptor)

### 필터와 인터셉터의 차이?
- 필터는 스프링과 무관한 서블릿의 자원
- 인터셉터는 스프링의 빈으로 관리되면서 스프링의 컨텍스트 내의 속한다.
- 즉 스프링 컨텍스트 내부 / 외부 차이


## 인증과 권한부여
- 인증 Authentication 은 자신을 증명하는 것
- 인가 Authorization 은 남에 의해서 자격이 부여되는 것

- 스프링 시큐리티에서 가장 중요한 역할을 하는 존재가 인증을 담당하는 AuthenticationManager
- ProviderManager: 인증에 대한 처리를 AuthenticationProvider라는 타입의 객체를 이용해서 처리를 위임한다.
- AuthenticationProvider 인증제공자는 실제 인증작업을 처리한다.
- 이때, 인증된 정보에는 권한에 대한 정보를 같이 전달하게 되는데 이 처리는 UserDetailsService라는 존재와 관련이 있다.
- UserDetailService 인터페이스의 구현체는 실제 사용자와 사용자가 가진 권한의 정보를 처리해서 반환하게 된다.


## 개발자가 스프링 시큐리티를 커스터마이징 하는 방식
- AuthenticationProvider 를 직접 구현
- UserDetailService 구현

- 대부분은 UserDetialService를 구현하는 형태를 사용하는 것으로 충분하지만,
- 새로운 프로토콜이나 인증 구현 방식을 직접 구현하는 경우에는 AuthenticationProvider 인터페이스를 직접 구현해서 사용해야한다.
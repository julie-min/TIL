# ResponseEntity

This can also be used in Spring MVC as the return value from an @Controller method:

```java
  @RequestMapping("/handle")
  public ResponseEntity<String> handle() {
    URI location = ...;
    HttpHeaders responseHeaders = new HttpHeaders();
    responseHeaders.setLocation(location);
    responseHeaders.set("MyResponseHeader", "MyValue");
    return new ResponseEntity<String>("Hello World", responseHeaders, HttpStatus.CREATED);
  }
  ```

 ```java
Or, by using a builder accessible via static methods:
  @RequestMapping("/handle")
  public ResponseEntity<String> handle() {
    URI location = ...;
    return ResponseEntity.created(location).header("MyResponseHeader", "MyValue").body("Hello World");
  }
  ```


```java
 @PostMapping("/api/articles") 
 public ResponseEntity<Article> addArticle(@RequestBody AddArticleRequest request) {
    Article savedArticle = blogService.save(request);
    return ResponseEntity.status(HttpStatus.CREATED)
            .body(savedArticle);
```
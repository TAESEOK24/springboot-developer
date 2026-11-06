package me.shinsunyoung.springbootdeveloper.springbootdeveloper.config.jwt;

import lombok.Builder;
import lombok.Getter;

import java.time.Duration;
import java.util.Date;
import java.util.Map;

import static java.util.Collections.emptyMap;

@Getter

public class JwtFactory {
    private String subject = "test@email.com";
    private Date issuedAt = new Date();
    private Date expiration = new Date(new Date().getTime()+ Duration.ofDays(14).
            toMillis());
    private Map<String, Object> claims = emptyMap();

    //282p부터 시작 굳이 test파일 작성 필요 없음
}

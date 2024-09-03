package com.wrld.lut_api_gateway.configs;

import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableReactiveMethodSecurity;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.oauth2.jwt.NimbusReactiveJwtDecoder;
import org.springframework.security.oauth2.jwt.ReactiveJwtDecoder;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationConverter;
import org.springframework.security.oauth2.server.resource.authentication.ReactiveJwtAuthenticationConverterAdapter;
import org.springframework.security.web.server.SecurityWebFilterChain;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import reactor.core.publisher.Mono;

// @Log4j2
// @Configuration
// @EnableWebFluxSecurity
// @EnableReactiveMethodSecurity
// @RequiredArgsConstructor
// public class SecurityConfig {
//     @Value("${spring.security.oauth2.resourceserver.jwt.jwk-set-uri}")
//     String jwkSetUri;

//     @Bean
//     public SecurityWebFilterChain securityFilterChain(ServerHttpSecurity http) throws Exception {
//         log.info("here sbfdshfbs");
//         http.csrf(ServerHttpSecurity.CsrfSpec::disable)
//                 .authorizeExchange(exchanges -> exchanges
//                         .pathMatchers("/service-ms/public/**").permitAll()
//                         .pathMatchers("/service-ms/user/**").hasRole("ROLE_USER")
//                         .pathMatchers("/service-ms/admin/**").hasRole("ROLE_ADMIN")
//                         .anyExchange().authenticated())
//                 .oauth2ResourceServer(oauth -> oauth
//                         .jwt(jwt -> jwt.jwtAuthenticationConverter(jwtAuthenticationConverterForKeycloak())));
//         return http.build();
//     }

//     // @Bean
//     // public Converter<Jwt, Mono<AbstractAuthenticationToken>> jwtAuthenticationConverterForKeycloak() {
//     //     JwtAuthenticationConverter jwtAuthenticationConverter = new JwtAuthenticationConverter();
//     //     jwtAuthenticationConverter.setJwtGrantedAuthoritiesConverter(jwt -> {
//     //         Collection<GrantedAuthority> authorities = extractAuthorities(jwt);
//     //         return authorities
//     //                 .stream()
//     //                 .map(Object::toString)
//     //                 .map("ROLE_"::concat)
//     //                 .map(SimpleGrantedAuthority::new)
//     //                 .collect(Collectors.toList());
//     //     });
//     //     return new ReactiveJwtAuthenticationConverterAdapter(jwtAuthenticationConverter);
//     // }

//     // private Collection<GrantedAuthority> extractAuthorities(Jwt jwt) {
//     //     Map<String, Collection<String>> realmAccess = jwt.getClaim("realm_access");
//     //     Collection<String> roles = realmAccess.get("roles");
//     //     log.info(roles);
//     //     return roles.stream()
//     //             .map(SimpleGrantedAuthority::new)
//     //             .collect(Collectors.toList());
//     // }

//     // @Bean
//     // public ReactiveJwtDecoder jwtDecoder() {
//     //     return NimbusReactiveJwtDecoder.withJwkSetUri(jwkSetUri)
//     //             .build();
//     // }

// }

@Configuration
@EnableWebFluxSecurity
public class KeycloakSecurityConfig {

  @Bean
  public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity http) {
    return http
        .csrf(ServerHttpSecurity.CsrfSpec::disable)
        .authorizeExchange(exchanges -> {
          exchanges
              .anyExchange()
              .authenticated();
        })
        .oauth2ResourceServer(oauth -> oauth.jwt(Customizer.withDefaults()))
        .build();
  }
}

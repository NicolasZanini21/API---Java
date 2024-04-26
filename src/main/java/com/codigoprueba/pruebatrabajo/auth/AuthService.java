package com.codigoprueba.pruebatrabajo.auth;


import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.codigoprueba.pruebatrabajo.Entity.Usuario;
import com.codigoprueba.pruebatrabajo.JWT.JwtService;
import com.codigoprueba.pruebatrabajo.Repository.UsuarioRepo;
import com.codigoprueba.pruebatrabajo.user.Role;



import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UsuarioRepo userRepository;
    private final JwtService jwtService;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;

    public AuthResponse login(Usuario request) { 
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
        Usuario usuario = userRepository.findByNombreUsuario(request.getNombreUsuario()).orElseThrow();
        String token=jwtService.getToken(usuario);
        return AuthResponse.builder()
            .token(token)
            .build();

    }

   

    public AuthResponse register(Usuario request) {
       Usuario user = Usuario.builder()
                .nombreUsuario(request.getNombreUsuario())
                .contraseña(passwordEncoder.encode(request.getContraseña()))
                .id(request.getId())
                .numeroDocumento(request.getNumeroDocumento())
                .role(Role.USER)
                .build();


        userRepository.save(user);

        return AuthResponse.builder()
            .token(jwtService.getToken(user))
            .build();
        
    }

}
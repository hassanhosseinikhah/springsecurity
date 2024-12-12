package com.example.springsecurity.service;//package com.example.sprignsec.service;
//
//import com.example.sprignsec.entity.Customer;
//import com.example.sprignsec.repository.CustomerRepo;
//import lombok.RequiredArgsConstructor;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class CustomUserDetailsService implements UserDetailsService {
//
//    private final CustomerRepo customerRepository;
//
//    public CustomUserDetailsService(CustomerRepo customerRepository) {
//        this.customerRepository = customerRepository;
//    }
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        Customer customer = customerRepository.findCustomersByEmail(username).orElseThrow(() -> new UsernameNotFoundException(username));
//        List<GrantedAuthority> authorities=List.of(new SimpleGrantedAuthority(customer.getRole()));
//        return new User(customer.getEmail(), customer.getPassword(),authorities);
//    }
//}

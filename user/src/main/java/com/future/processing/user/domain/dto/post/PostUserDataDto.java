package com.future.processing.user.domain.dto.post;

import com.future.processing.user.domain.constraint.UniqueEmail;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Value;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Value
@Builder
@RequiredArgsConstructor
@NoArgsConstructor(force = true)
public class PostUserDataDto implements Serializable {

    @NotNull
    @Size(min = 1, max = 40)
    private String lastName;

    @NotNull
    @Size(min = 1, max = 40)
    private String firstName;

    @Email
    @NotNull
    @UniqueEmail
    private String email;

    @NotNull
    @Pattern(regexp ="(^$|[0-9]{9})")
    private String phoneNumber;
}

package com.employeemanagement.www.api;

import java.math.BigDecimal;
import com.employeemanagement.www.model.Employee;
import com.employeemanagement.www.model.Error;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-04T22:21:26.089-05:00[America/Chicago]")
@Controller
@RequestMapping("${openapi.employeeManagementSystem.base-path:}")
public class EmployeeApiController implements EmployeeApi {

    private final EmployeeApiDelegate delegate;

    public EmployeeApiController(@Autowired(required = false) EmployeeApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new EmployeeApiDelegate() {});
    }

    @Override
    public EmployeeApiDelegate getDelegate() {
        return delegate;
    }

}

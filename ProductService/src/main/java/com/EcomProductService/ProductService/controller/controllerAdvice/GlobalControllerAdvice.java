package com.EcomProductService.ProductService.controller.controllerAdvice;

import com.EcomProductService.ProductService.dto.ErrorResponseDTO;
import com.EcomProductService.ProductService.exception.InvalidTitleException;
import com.EcomProductService.ProductService.exception.ProductNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalControllerAdvice {
    @ExceptionHandler(value = ProductNotFoundException.class)
    public ResponseEntity<ErrorResponseDTO> handleProductNotFoundException(Exception ex){
        ErrorResponseDTO errorResponseDTO = new ErrorResponseDTO();
        errorResponseDTO.setMessage(ex.getMessage());
        errorResponseDTO.setMessageCode(404);
        return new ResponseEntity<>(errorResponseDTO, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = InvalidTitleException.class)
    public ResponseEntity<ErrorResponseDTO> handleInvalidTitleException(Exception ex){
        ErrorResponseDTO errorResponseDTO = new ErrorResponseDTO();
        errorResponseDTO.setMessage(ex.getMessage());
        errorResponseDTO.setMessageCode(400);
        return new ResponseEntity<>(errorResponseDTO, HttpStatus.FORBIDDEN);
    }


}

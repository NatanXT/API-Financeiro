package com.Financeiro.APIFinanceiro.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ErrorResponse> handlePessoaNotFoundException(NotFoundException ex, WebRequest request) {
        logger.error("Pessoa not found: {}", ex.getMessage());
        ErrorResponse errorResponse = new ErrorResponse(
                ex.getMessage(),
                request.getDescription(false),
                LocalDateTime.now(),
                HttpStatus.NOT_FOUND.value()
        );
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(RegraNegocioException.class)
    public ResponseEntity<ErrorResponse> handleApplicationdException(NotFoundException ex, WebRequest request) {
        logger.error("Regra de Negocio: {}", ex.getMessage());
        ErrorResponse errorResponse = new ErrorResponse(
                ex.getMessage(),
                request.getDescription(false),
                LocalDateTime.now(),
                HttpStatus.NOT_FOUND.value()
        );
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handleGlobalException(Exception ex, WebRequest request) {
        logger.error("An error occurred: {}", ex.getMessage());
        ErrorResponse errorResponse = new ErrorResponse(
                "An unexpected error occurred.",
                request.getDescription(false),
                LocalDateTime.now(),
                HttpStatus.INTERNAL_SERVER_ERROR.value()
        );
        return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}

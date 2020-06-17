package com.example.task5.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class PrintAnnotationAspect {
    @Before("@annotation(com.example.task5.aspect.Println)")
    public void annotationAspectAdvice(JoinPoint joinPoint){
      System.out.println("arguments : " + Arrays.toString(joinPoint.getArgs()));
 }
}

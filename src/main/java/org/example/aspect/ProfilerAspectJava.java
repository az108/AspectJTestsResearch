package org.example.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import java.util.*;

import java.nio.file.Path;

@Aspect
public class ProfilerAspectJava {

    //Folgende Pointcuts und Before annotationen zeigen wie man read und write aufrufe blocken könnte (nach dem Meeting gestern eher irrelevant wahrscheinlich)

    @Pointcut("(call(* java.io.FileInputStream.read(..)) || call(* java.nio.file.Files.readAllBytes(..))) && within(org.example.service..*)")
    public void fileReadOperations() {}

    /*
    @Pointcut("(call(* java.io.FileOutputStream.write(..)) || call(* java.nio.file.Files.write(..))) && within(org.example.service..*)")
    public void fileWriteOperations() {}

     */

    @Before("fileReadOperations()")
    public void beforeFileRead(JoinPoint joinPoint) {
        System.out.println("Blocking file read operation: " + joinPoint.getSignature().toShortString());
        throw new SecurityException("File read operation blocked by AspectJ");
    }

    /*
    @Before("fileWriteOperations()")
    public void beforeFileWrite(JoinPoint joinPoint) {
        System.out.println("Blocking file write operation: " + joinPoint.getSignature().toShortString());
        throw new SecurityException("File write operation blocked by AspectJ");
    }

     */

}
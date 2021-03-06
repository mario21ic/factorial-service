package com.domingosuarez.talks.kubernetes.jvmmx.factorialservice.web;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class FactorialResult {
  private Integer of;
  private Long result;
  private String version;
}

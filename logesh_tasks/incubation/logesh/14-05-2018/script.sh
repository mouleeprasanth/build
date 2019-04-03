#!/bin/bash

  ls -l | grep '^-' | awk '
  BEGIN{
  split("B KB MB",v)
  } 
  {
  s=1;
  while($5>1023&&s<4)
  {$5/=1024;
  s++}
  printf "%-30s %6.2f %-4s %-2s %-4s %-6s\n",$9,$5,v[s],$6,$7,$8}'

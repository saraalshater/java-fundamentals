function xor(a,b) {
  if (and(a,b))
    return 0;
  return or(a,b)
}

function not(a) {
  if (a === 0)
    return 1
  else
    return 0
}

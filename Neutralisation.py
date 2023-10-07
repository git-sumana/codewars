def neutralise(str1, str2):
    result = []
    
    for char1, char2 in zip(str1, str2):
        if char1 == '+' and char2 == '+':
            result.append('+')
        elif char1 == '-' and char2 == '-':
            result.append('-')
        else:
            result.append('0')
    
    return ''.join(result)
import pandas


student_data = {
    'Предмет': ['русского языка', 'химии', 'физики', 'биологии', 'информатики'],
    'Номер парты': ['1', '2', '3', '4', '5'],
    'Ряд': ['пятый ряд', 'третий ряд', 'первый ряд', 'четвертый ряд', 'второй ряд'],
    'Вариант': ['1 вариант', '2 вариант', '1 вариант ', '2 вариант ', '1 вариант'],
    'ID': ['3', '4', '1', '2', '5']
}

sd = pandas.DataFrame(data=student_data)
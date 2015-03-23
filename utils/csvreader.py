import csv


def read(file, callback):
    with open(file, 'r') as f:
        reader = csv.DictReader(f, delimiter=',')
        callback([row for row in reader])


def write(file, lst):
    with open(file, 'w') as f:
        for x in lst:
            f.write(x)

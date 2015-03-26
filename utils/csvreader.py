import csv

def read(file, callback):
    with open(file, 'r') as f:
        reader = csv.DictReader(f, delimiter=',')
        callback([row for row in reader])


def write(file, header, lst):
    with open(file, 'w') as f:
        writer = csv.DictWriter(f, header, delimiter=',')
        writer.writeheader()
        writer.writerows(lst)


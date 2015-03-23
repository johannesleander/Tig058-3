import csvreader
import datetime
import random


def createId(bdate):
    dl = list(map(int, bdate.split('-')))
    dt = datetime.datetime(dl[0],dl[1],dl[2])
    id = dt.strftime('%y%m%d')
    return id + "-" + str(random.randint(1000,9999))

def formatRow(row):
    print(row)

if __name__ == '__main__':
    csvreader.read('person.csv',formatRow)

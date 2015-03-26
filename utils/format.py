import csvreader
import datetime
import random

wheader = ['id','name','surname','email','gender','birthdate','joindate','active']
wrows = []

def unix_time(dt):
    epoch = datetime.datetime.utcfromtimestamp(0)
    delta = dt - epoch
    return delta.total_seconds()

def unix_time_millis(dt):
    return unix_time(dt) * 1000.0

def createId(bdate):
    dl = list(map(int, bdate.split('-')))
    dt = datetime.datetime(dl[0],dl[1],dl[2])
    id = dt.strftime('%y%m%d')
    return id + "-" + str(random.randint(1000,9999))

def str_dt(s):
    d = list(map(int, s.split('-')))
    return datetime.datetime(d[0],d[1],d[2])


def formatRows(rows):
    for row in rows:
        row['id'] = createId(row['birthdate'])
        row['birthdate'] = unix_time_millis(str_dt(row['birthdate']))
        row['joindate'] = unix_time_millis(str_dt(row['joindate']))
        wrows.append(row)

if __name__ == '__main__':
    csvreader.read('person.csv',formatRows)
    csvreader.write('formatted.csv', wheader, wrows)
    

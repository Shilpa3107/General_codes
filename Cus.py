def is_valid_calendar(days_in_year, days_in_month):
    rem = days_in_year % days_in_month
    months = days_in_year // days_in_month
    acc = 0
    for year in range(1, 1000):
        m = months
        acc += rem
        if acc >= days_in_month:
            m += 1
            acc -= days_in_month
        if m > 99 or days_in_month > 99:
            return False
    return True

def parse_date(date_str):
    try:
        y, m, d = map(int, date_str.strip().split('-'))
        return y, m, d
    except:
        return -1, -1, -1

def is_valid_date(y, m, d, days_in_year, days_in_month):
    if y < 1 or m < 1 or d < 1:
        return False

    base_months = days_in_year // days_in_month
    rem = days_in_year % days_in_month
    acc = 0
    months = base_months

    for i in range(1, y):
        acc += rem
        if acc >= days_in_month:
            acc -= days_in_month

    # Does the current year get a leap month?
    if acc + rem >= days_in_month:
        months += 1

    return m <= months and d <= days_in_month

def total_days_from_start(y, m, d, days_in_year, days_in_month):
    total_days = 0
    rem = days_in_year % days_in_month
    base_months = days_in_year // days_in_month
    acc = 0

    for year in range(1, y):
        total_days += base_months * days_in_month
        acc += rem
        if acc >= days_in_month:
            total_days += days_in_month
            acc -= days_in_month

    # For current year, add months and days
    total_days += (m - 1) * days_in_month + (d - 1)
    return total_days

def get_day_letter(n, days_in_week):
    return chr(ord('A') + (n % days_in_week))

def main():
    try:
        s = input().strip()
        days_in_year, days_in_month, days_in_week, date_str = s.split()
        days_in_year = int(days_in_year)
        days_in_month = int(days_in_month)
        days_in_week = int(days_in_week)
    except:
        print("-1")
        return

    if not (1 <= days_in_year <= 2000 and
            1 <= days_in_month <= 200 and
            1 <= days_in_week <= 26 and
            days_in_month < days_in_year):
        print("-1")
        return

    if not is_valid_calendar(days_in_year, days_in_month):
        print("-1")
        return

    y, m, d = parse_date(date_str)
    if y == -1:
        print("-1")
        return

    if not is_valid_date(y, m, d, days_in_year, days_in_month):
        print("-1")
        return

    total_days = total_days_from_start(y, m, d, days_in_year, days_in_month)
    print(get_day_letter(total_days, days_in_week))

# Run the program
if __name__ == "__main__":
    main()
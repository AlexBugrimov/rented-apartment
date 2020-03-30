import Home from './pages/Home';
import Tariffs from './pages/Tariffs';
import Counts from './pages/Counts';
import Payment from './pages/Payment';
import NoMatch from './pages/NoMatch';

import tariffs from './assept/tariffs.svg';
import home from './assept/home.svg';
import counts from './assept/counts.svg';
import payment from './assept/payment.svg';

export default () => [
  {
    item: 'home',
    exact: true,
    label: 'Home',
    icon: home,
    route: '/',
    page: Home
  },
  {
    item: 'tariffs',
    exact: false,
    label: 'Тарифы',
    icon: tariffs,
    route: '/tariffs',
    page: Tariffs
  },
  {
    item: 'counts',
    exact: false,
    label: 'Счетчики',
    icon: counts,
    route: '/counts',
    page: Counts
  },
  {
    item: 'payment',
    exact: false,
    label: 'Оплата',
    icon: payment,
    route: '/payment',
    page: Payment
  },
  {
    item: 'noMatch',
    exact: false,
    label: '404',
    icon: null,
    route: null,
    page: NoMatch
  },
]

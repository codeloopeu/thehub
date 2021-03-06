import clearJobsAction from 'redux/actions/clearJobs';
import { findJobs } from 'utils/api';
import setJobsAction from 'redux/actions/setJobs';
import { showAlert } from 'utils/commons';
import { useDispatch } from 'react-redux';
import { useEffect, useState } from 'react';

function useSearchData(query) {
  const dispatch = useDispatch();
  const [isDownloading, setDownloading] = useState(false);
  const [isDownloaded, setDownloaded] = useState(false);
  const [lastQuery, setLastQuery] = useState('');

  if (isDownloading !== true && lastQuery !== query) {
    setDownloaded(false);
    setLastQuery(query);
  }

  useEffect(() => {
    async function fetchData() {
      if (isDownloaded !== true && isDownloading !== true) {
        setDownloading(true);
        dispatch(clearJobsAction());
        if (lastQuery.length > 0) {
          const jobs = await findJobs(lastQuery)
            .catch(() => showAlert('Error occurred while downloading jobs!'));
          dispatch(setJobsAction(jobs));
          setDownloaded(true);
          setDownloading(false);
        }
      }
    }
    fetchData();
  }, [isDownloaded, isDownloading, dispatch, lastQuery]);
}

export default useSearchData;
